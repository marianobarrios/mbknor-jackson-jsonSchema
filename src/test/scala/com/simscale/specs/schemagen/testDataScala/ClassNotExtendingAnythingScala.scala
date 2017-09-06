package com.simscale.specs.schemagen.testDataScala

import com.simscale.specs.schemagen.testData.MyEnum

case class ClassNotExtendingAnythingScala(someString:String, myEnum: MyEnum, myEnumO: Option[MyEnum])
