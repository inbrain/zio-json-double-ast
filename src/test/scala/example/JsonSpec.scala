package example

import org.specs2.Specification
import org.specs2.specification.core.SpecStructure
import zio.json._

final class JsonSpec extends Specification {

  def is: SpecStructure =
    s2"""
        Json
           converts to double the same way with or without AST $toDouble
      """

  private def toDouble = {
    val rq = 1.9343414338768294e-4

    rq.toJson ==== rq.unsafeToJsonAST.toJson
  }
}




