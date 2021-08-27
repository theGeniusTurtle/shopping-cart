package services

import io.estatico.newtype.macros._

import java.util.UUID

trait Categories[F[_]] {
    def findAll: F[List[Category]]

    @newtype case class CategoryId(value: UUID)
    @newtype case class CategoryName(value: String)

    case class Category(id: CategoryId, name: CategoryName)
}