/*
 * Copyright (c) 2011-2013, ScalaFX Project
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
package scalafx.scene

import javafx.scene.{paint => jfxsp}
import javafx.{scene => jfxs}
import scalafx.Includes._
import scalafx.beans.property.{DoubleProperty, ObjectProperty}
import scalafx.delegate.SFXDelegate
import scalafx.scene.paint.Paint

object SubScene {
  implicit def sfxSubScene2jfx(v: SubScene) = v.delegate
}


/** Wraps [[http://docs.oracle.com/javafx/8/api/javafx/scene/SubScene.html]]. */
class SubScene(override val delegate: jfxs.SubScene)
  extends Node(delegate)
  with SFXDelegate[jfxs.SubScene] {

  // TODO Make SubScene API similar to SFX Scene, for instance create root content as Group and provide:
  // def this(width: Double, height: Double) =  ...

  /** Creates a SubScene for a specific root Node with a specific size. */
  def this(root: Parent, width: Double, height: Double) = this(new jfxs.SubScene(root, width, height))

  /** Constructs a SubScene consisting of a root, with a dimension of width and height,
    * specifies whether a depth buffer is created for this scene and specifies whether
    * scene anti-aliasing is requested.
    */
  def this(root: Parent, width: Double, height: Double, depthBuffer: Boolean, antiAliasing: Boolean) =
    this(new jfxs.SubScene(root, width, height, depthBuffer, antiAliasing))

  /** Defines the root Node of the SubScene scene graph. */
  def root: ObjectProperty[jfxs.Parent] = delegate.rootProperty
  def root_=(v: Parent) {
    ObjectProperty.fillProperty[jfxs.Parent](this.root, v)
  }

  /** Specifies the type of camera use for rendering this SubScene. */
  def camera: ObjectProperty[jfxs.Camera] = delegate.cameraProperty
  def camera_=(v: Camera) {
    ObjectProperty.fillProperty[jfxs.Camera](this.camera, v)
  }

  /** Defines the background fill of this SubScene. */
  def fill: ObjectProperty[jfxsp.Paint] = delegate.fillProperty
  def fill_=(v: Paint) {
    ObjectProperty.fillProperty[jfxsp.Paint](this.fill, v)
  }

  /** Defines the height of this SubScene. */
  def height: DoubleProperty = delegate.heightProperty
  def height_=(v: Double) {
    height() = v
  }

  /** Defines the width of this SubScene. */
  def width: DoubleProperty = delegate.widthProperty
  def width_=(v: Double) {
    width() = v
  }

  /** Return true if this SubScene is anti-aliased otherwise false. */
  def isAntiAliasing: Boolean = delegate.isAntiAliasing
}