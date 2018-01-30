val l = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

def tail(list: List[Int]): List[Int] = {
  ???
}

def setHead(element: Int, list: List[Int]): List[Int] = {
  ???
}

def drop(n: Int, list: List[Int]): List[Int] = {
  ???
}

def dropWhile(list: List[Int], p: Int => Boolean): List[Int] = {
  ???
}

def append(l1: List[Int], l2: List[Int]): List[Int] = {
  ???
}

def sum(list: List[Int]): Int = {
  ???
}

def foldRight[A, B](as: List[A], z: B)(f: (A, B) => B): B = {
  as match {
    case Nil => z
    case x :: xs => f( (x, foldRight(xs, z) (f)) )
  }
}

def sum2(list: List[Int]): Int = {
  ???
}