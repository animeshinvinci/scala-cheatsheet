package com.allaboutscala.testing

import org.scalatest.{Matchers, FlatSpec}

/**
  * Created by Nadim Bahadoor on 08/04/2017.
  *
  *  Code snippets for ScalaTest
  *
  * [http://allaboutscala.com/scala-cheatsheet/#scalatest-introduction]
  *
  * Copyright 2016 Nadim Bahadoor (http://allaboutscala.com)
  *
  * Licensed under the Apache License, Version 2.0 (the "License"); you may not
  * use this file except in compliance with the License. You may obtain a copy of
  * the License at
  *
  *  [http://www.apache.org/licenses/LICENSE-2.0]
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
  * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
  * License for the specific language governing permissions and limitations under
  * the License.
  */
class Tutorial_06_Type_Test extends FlatSpec with Matchers {

  "Examples of type assertions" should "be valid" in {
    val donutStore = new DonutStore()
    donutStore shouldBe a [DonutStore]
    donutStore.favouriteDonut() shouldBe a [String]
    donutStore.donuts() shouldBe a [Seq[_]]
  }
}
