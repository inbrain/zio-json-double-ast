import zio.json.JsonEncoder
import zio.json.ast.Json

import scala.language.implicitConversions

package object example {
  implicit def jsonEncoderOps[A](a: A): EncoderOps[A] = new EncoderOps(a)

  final class EncoderOps[A](private val a: A) extends AnyVal {
    def unsafeToJsonAST(implicit encoder: JsonEncoder[A]): Json =
      encoder.toJsonAST(a) match {
        case Left(error) => throw new IllegalStateException(error)
        case Right(json) => json
      }
  }
}
