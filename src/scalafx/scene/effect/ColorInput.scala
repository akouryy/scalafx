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

package scalafx.scene.effect

import scalafx.Includes._
import javafx.scene.{ effect => jfxse }
import scalafx.scene.paint._
import scalafx.util.SFXDelegate
import scalafx.util.PositionDelegate
import scalafx.util.DimensionDelegate

object ColorInput {
  implicit def sfxColorInput2jfx(ci: ColorInput) = ci.delegate
}

class ColorInput(override val delegate: jfxse.ColorInput = new jfxse.ColorInput)
  extends Effect(delegate)
  with PositionDelegate
  with DimensionDelegate
  with SFXDelegate[jfxse.ColorInput] {

  def positionedDelegate = delegate.asInstanceOf[Positioned]

  /**
   * Indicates the height and width of the region to be flooded, relative to the local coordinate
   * space of the content Node.
   */
  def dimensionedDelegate = delegate.asInstanceOf[Dimensioned]

  /**
   * Creates a new instance of ColorInput with the specified x, y, width, height, and paint.
   */
  def this(x: Double, y: Double, width: Double, height: Double, paint: Paint) =
    this(new jfxse.ColorInput(x, y, width, height, paint))

  /**
   * The Paint used to flood the region.
   */
  def paint = delegate.paintProperty
  def paint_=(v: Paint) {
    paint() = v
  }

}