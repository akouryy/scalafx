/*
 * Copyright (c) 2012, ScalaFX Project
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the ScalaFX Project nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE SCALAFX PROJECT OR ITS CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED
 * AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package scalafx.geometry

import javafx.{ geometry => jfxg }
import scalafx.Includes._
import scalafx.testutil.AbstractSFXDelegateSpec
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
 * Dimension2D Spec tests.
 *
 */
@RunWith(classOf[JUnitRunner])
class Dimension2DSpec
  extends AbstractSFXDelegateSpec[jfxg.Dimension2D, Dimension2D, jfxg.Dimension2DBuilder[_]](classOf[jfxg.Dimension2D], classOf[Dimension2D], classOf[jfxg.Dimension2DBuilder[_]]) {

  override protected def getScalaClassInstance = new Dimension2D(0, 0)

  protected def convertScalaClassToJavaClass(sfxObject: Dimension2D) = {
    val jfxDimension2D: jfxg.Dimension2D = sfxObject
    jfxDimension2D
  }

  override protected def getJavaClassInstance = new jfxg.Dimension2D(0, 0)

  protected def convertJavaClassToScalaClass(jfxObject: jfxg.Dimension2D) = {
    val sfxDimension2D: Dimension2D = jfxObject
    sfxDimension2D
  }
}