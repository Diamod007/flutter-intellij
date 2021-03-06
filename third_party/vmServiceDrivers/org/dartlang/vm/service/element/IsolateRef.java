/*
 * Copyright (c) 2015, the Dart project authors.
 *
 * Licensed under the Eclipse Public License v1.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package org.dartlang.vm.service.element;

// This is a generated file.

import com.google.gson.JsonObject;

/**
 * {@link IsolateRef} is a reference to an {@link Isolate} object.
 */
@SuppressWarnings({"WeakerAccess", "unused"})
public class IsolateRef extends Response {

  public IsolateRef(JsonObject json) {
    super(json);
  }

  /**
   * Provided and set to true if the id of an Object is fixed. If true, the id of an Object is
   * guaranteed not to change or expire. The object may, however, still be _Collected_.
   *
   * Can return <code>null</code>.
   */
  public boolean getFixedId() {
    return json.get("fixedId") == null ? false : json.get("fixedId").getAsBoolean();
  }

  /**
   * The id which is passed to the getIsolate RPC to load this isolate.
   */
  public String getId() {
    return json.get("id").getAsString();
  }

  /**
   * A name identifying this isolate. Not guaranteed to be unique.
   */
  public String getName() {
    return json.get("name").getAsString();
  }

  /**
   * A numeric id for this isolate, represented as a string. Unique.
   */
  public String getNumber() {
    return json.get("number").getAsString();
  }
}
