package services

import io.estatico.newtype.macros._

import java.util.UUID

trait Brands[F[_]] {
    def findAll: F[List[Brand]]

    @newtype case class BrandId(value: UUID)
    @newtype case class BrandName(value: String)

    case class Brand(id: BrandId, name: BrandName)
}