/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 *
 * This program is made available under the terms of the MIT License.
 * See the LICENSE file in the project root for more information.
 */
package com.microsoft.dhalion.resolver;

import com.microsoft.dhalion.api.IResolver;
import com.microsoft.dhalion.diagnoser.Diagnosis;

/**
 * {@link Action} is a representation of a action taken by {@link IResolver} to fix a
 * {@link Diagnosis}
 */
public class Action {
  private String name;

  public Action(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
