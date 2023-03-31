package com.knoldus.equality

object EqualityMethodsDriver extends App {

  private val equalityMethodsObject = new EqualityMethods()

  private val list1: List[Int] = List(1, 2, 3, 4)
  private val list2: List[Int] = List(1, 2, 3, 4)

  private val name1 = "Steve"
  private val name2 = "Stark"

  private val number1 = 10
  private val number2 = 20

  // printing the result of doubleEqualOperator() function
  println(equalityMethodsObject.doubleEqualOperator(list1, list2))
  println(equalityMethodsObject.doubleEqualOperator(name1, name2))
  println(equalityMethodsObject.doubleEqualOperator(number1, number2))

  // printing the result of notEqualOperator() function
  println(equalityMethodsObject.notEqualOperator(list1, list2))
  println(equalityMethodsObject.notEqualOperator(name1, name2))
  println(equalityMethodsObject.notEqualOperator(number1, number2))

  // printing the result of notEqualtoKeyword() function
  println(equalityMethodsObject.notEqualtoKeyword(list1, list2))

  // printing the result of equalKeyword() function
  println(equalityMethodsObject.equalKeyword(list1, list2))
}
