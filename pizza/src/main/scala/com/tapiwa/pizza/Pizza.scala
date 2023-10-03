package com.tapiwa.pizza

sealed trait Ingridient

sealed trait Topping extends Ingridient 
case object CheeseTopping extends Topping
case object PepperoniTopping extends Topping
case object SausageTopping extends Topping
case object MushroomTopping extends Topping
case object OnionsTopping extends Topping

sealed trait CrustType extends Ingridient
case object ThinCrustType extends CrustType
case object RegularCrustType extends CrustType
case object ThickCrustType extends CrustType

sealed trait CrustSize extends Ingridient
case object SmallCrustSize extends CrustSize
case object MediumCrustSize extends CrustSize
case object LargeCrustSize extends CrustSize

class UnitPrices
{
  val price = scala.collection.mutable.Map(
    CheeseTopping -> 1.23,
    PepperoniTopping -> 2.34,
    SausageTopping -> 3.45,
    MushroomTopping -> 4.56,
    OnionsTopping -> 5.43,
    ThinCrustType -> 0.98,
    RegularCrustType -> 1.23,
    ThickCrustType -> 2.34,
    SmallCrustSize -> 3.21,
    MediumCrustSize -> 2.13,
    LargeCrustSize -> 1.32)
}

class Pizza ( 
  var crustType: CrustType = RegularCrustType,
  var crustSize: CrustSize = MediumCrustSize
)
{
  val toppings = scala.collection.mutable.ArrayBuffer[Topping]()

  def addTopping(t: Topping): Unit = toppings += t
  def removeTopping(t: Topping): Unit = toppings -= t
  def removeAllToppings(): Unit = toppings.clear()

  def getPrice =
  {
    def price =
    {
      var sum = 0.0

      var ingredients = List(crustType, crustSize) ++: toppings.toList
    
      for ( ing <- ingredients )
      {
         println()
         printf(s"$ing ")
         sum += (new UnitPrices).price.get(SmallCrustSize).get 
      }

      sum
    }
    price
  }

  override def toString(): String = {
    s"""
    |Crust type: $crustType
    |Crust size: $crustSize
    |Toppings: $toppings
    """.stripMargin
  }
}

object PizzaOrder extends App
{
  val p = new Pizza
  p.addTopping(MushroomTopping)
  p.addTopping(OnionsTopping)
  printf("\n\n%.2f\f", p.getPrice)
  println(p)
}
