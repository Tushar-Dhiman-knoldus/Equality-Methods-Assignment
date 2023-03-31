package com.knoldus.equality
import org.scalatest.flatspec.AnyFlatSpec

class EqualityMethodsSpec extends AnyFlatSpec {

  val eq = new EqualityMethods()

  "doubleEqualOperator" should "return true when operands are equal" in {
    assert(eq.doubleEqualOperator(5, 5))
    assert(eq.doubleEqualOperator("hello", "hello"))
  }

  it should "return false when operands are not equal" in {
    assert(!eq.doubleEqualOperator(5, 6))
    assert(!eq.doubleEqualOperator("hello", "world"))
  }

  "notEqualOperator" should "return true when operands are not equal" in {
    assert(eq.notEqualOperator(5, 6))
    assert(eq.notEqualOperator("hello", "world"))
  }

  it should "return false when operands are equal" in {
    assert(!eq.notEqualOperator(5, 5))
    assert(!eq.notEqualOperator("hello", "hello"))
  }

  "notEqualtoKeyword" should "return true when operands are not equal" in {
    val a = new Object()
    val b = new Object()
    assert(eq.notEqualtoKeyword(a, b))
  }

  it should "return false when operands are equal" in {
    val a = new Object()
    val b = a
    assert(!eq.notEqualtoKeyword(a, b))
  }

  "equalKeyword" should "return true when operands are equal" in {
    val a = new Object()
    val b = a
    assert(eq.equalKeyword(a, b))
  }

  it should "return false when operands are not equal" in {
    val a = new Object()
    val b = new Object()
    assert(!eq.equalKeyword(a, b))
  }
}

