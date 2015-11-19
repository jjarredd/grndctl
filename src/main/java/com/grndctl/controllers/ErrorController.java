/**
 * This file is part of grndctl.
 *
 * grndctl is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * grndctl is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with grndctl.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.grndctl.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Michael Di Salvo
 */
@RestController
public class ErrorController implements org.springframework.boot.autoconfigure.web.ErrorController {

    private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public String handleError() {
        return "<img src=\"img/404-bg_2x.gif\" width=\"100%\" height=\"100%\"\">";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}
