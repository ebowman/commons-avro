package com.gilt.pickling.avroschema

import org.scalatest.{Assertions, FunSuite}
import scala.pickling._
import com.gilt.pickling.TestObjs.{ClassInnerObject, ObjInnerObject}

class OnlyCaseClassAsRootObjTests extends FunSuite with Assertions {

  test("Should not serialise an Object") {
    intercept[PicklingException] {
      ObjInnerObject.pickle
    }
  }

  test("Should not serialise an instance of a Class") {
    intercept[PicklingException] {
      new ClassInnerObject(1).pickle
    }
  }

  test("Should not serialise a List as a root") {
    intercept[PicklingException] {
      List(1).pickle
    }
  }

  test("Should not serialise a Array as a root") {
    intercept[PicklingException] {
      Array(1).pickle
    }
  }

  test("Should not serialise a Set as a root") {
    intercept[PicklingException] {
      Set(1).pickle
    }
  }

  test("Should not serialise a Integer as a root") {
    intercept[PicklingException] {
      1.pickle
    }
  }

  test("Should not serialise a Long as a root") {
    intercept[PicklingException] {
      1L.pickle
    }
  }
  test("Should not serialise a Float as a root") {
    intercept[PicklingException] {
      1F.pickle
    }
  }

  test("Should not serialise a Double as a root") {
    intercept[PicklingException] {
      1D.pickle
    }
  }

  test("Should not serialise a Boolean as a root") {
    intercept[PicklingException] {
      true.pickle
    }
  }

  test("Should not serialise a String as a root") {
    intercept[PicklingException] {
      "abc".pickle
    }
  }

  test("Should not serialise a Byte as a root") {
    intercept[PicklingException] {
      1.toByte.pickle
    }
  }

  test("Should not serialise a Short as a root") {
    intercept[PicklingException] {
      1.toShort.pickle
    }
  }

  test("Should not serialise a Char as a root") {
    intercept[PicklingException] {
      'c'.toShort.pickle
    }
  }

  test("Should not serialise a Unit") {
    val someUnit: Unit = ()
    intercept[NotImplementedError] {
      // a scala pickling error
      someUnit.pickle
    }
  }
}
