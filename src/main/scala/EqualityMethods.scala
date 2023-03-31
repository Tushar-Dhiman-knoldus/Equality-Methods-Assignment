package com.knoldus.equality

class EqualityMethods() {

  // function to check == operation
  def doubleEqualOperator[T](operand1: T, operand2: T): Boolean = {
    operand1 == operand2
  }

  // function to check != operation
  def notEqualOperator[T](operand1: T, operand2: T): Boolean = {
    operand1 != operand2
  }

  // function to check ne keyword operation
  def notEqualtoKeyword[T <: AnyRef](operand1: T, operand2: T): Boolean = {
    operand1 ne operand2
  }

  // function to check eq keyword operation
  def equalKeyword[T <: AnyRef](operand1: T, operand2: T): Boolean ={
    operand1 eq operand2
  }
}