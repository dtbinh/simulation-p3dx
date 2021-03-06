/**
 * Copyright (c) 2014 Saúl Piña <sauljabin@gmail.com>, Jorge Parra <thejorgemylio@gmail.com>.
 * 
 * This file is part of SimulationP3DX.
 * 
 * SimulationP3DX is licensed under The MIT License.
 * For full copyright and license information please see the LICENSE file.
 */

package app.util;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

import org.reflections.Reflections;

import app.com.ClassW;

public class UtilClass {
	public static Vector<ClassW> getSubClass(Class<?> clazz) {
		Reflections reflections = new Reflections();
		Iterator<?> subtypes = reflections.getSubTypesOf(clazz).iterator();
		Vector<ClassW> vector = new Vector<ClassW>();
		while (subtypes.hasNext()) {
			vector.add(new ClassW((Class<?>) subtypes.next()));
		}
		Collections.sort(vector);
		return vector;
	}
}
