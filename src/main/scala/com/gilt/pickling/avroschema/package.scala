package com.gilt.pickling

import scala.language.implicitConversions

package object avroschema {
  implicit val pickleFormat = new AvroSchemaPickleFormat

  implicit def toAvroSchemaPickle(value: Array[Byte]): AvroSchemaPickle = AvroSchemaPickle(value)
}



