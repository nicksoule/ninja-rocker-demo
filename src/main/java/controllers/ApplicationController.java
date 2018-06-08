/**
 * Copyright (C) 2012-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Copyright (C) 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package controllers;

import org.slf4j.Logger;

import com.fizzed.rocker.Rocker;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import model.Player;
import ninja.Context;
import ninja.FilterWith;
import ninja.Ninja;
import ninja.Result;
import ninja.Results;
import ninja.SecureFilter;
import ninja.exceptions.BadRequestException;
import ninja.i18n.Lang;
import ninja.params.Param;
import ninja.utils.NinjaProperties;
import ninja.validation.Validation;

@Singleton
public class ApplicationController {


	public Result index() {
		Player player = new Player();
		player.setName("Nick");
		return Results.html().render(views.index.template("Index", player));

	}

}
