import scala.util.{Random, Try}
import scala.concurrent.{Future, ExecutionContext}

type CoffeeBeans = String
type GroundCoffee = String
case class Water(temperature: Int)
type Milk = String
type FrothedMilk = String
type Espresso = String
type Cappuccino = String

case class GrindingException(msg: String) extends Exception(msg)
case class FrothingException(msg: String) extends Exception(msg)
case class WaterBoilingException(msg: String) extends Exception(msg)
case class BrewingException(msg: String) extends Exception(msg)


def grind(beans: CoffeeBeans): GroundCoffee = {
  println("start grinding...")
  Thread.sleep(Random.nextInt(2000))
  if (beans == "baked beans") throw GrindingException("are you joking?")
  println("finished grinding...")
  s"ground coffee of $beans"
}

def heatWater(water: Water): Water = {
  println("heating the water now")
  Thread.sleep(Random.nextInt(2000))
  println("hot, it's hot!")
  water.copy(temperature = 85)
}

def frothMilk(milk: Milk): FrothedMilk = {
  println("milk frothing system engaged!")
  Thread.sleep(Random.nextInt(2000))
  println("shutting down milk frothing system")
  s"frothed $milk"
}

def brew(coffee: GroundCoffee, heatedWater: Water): Espresso = {
  println("happy brewing :)")
  Thread.sleep(Random.nextInt(2000))
  println("it's brewed!")
  "espresso"
}

def combine(espresso: Espresso, frothedMilk: FrothedMilk): Cappuccino = {
  Thread.sleep(Random.nextInt(1000))
  "cappuccino"
}

def temperatureOkay(water: Water): Future[Boolean] = Future {
  (80 to 85).contains(water.temperature)
}

def prepareCappuccino(): Cappuccino = {
  val milk = "Milk"
  val beans = "Dark roast beans"
  val water = Water(25)

  ???
}

def carefullyPrepareCappuccino(): Try[Cappuccino] = {
  ???
}

def prepareCappuccinoAsync(): Future[Cappuccino] = {
  ???
}

def prepareWarmEnoughCappuccino(): Future[Cappuccino] = {
  ???
}