package soot.coffi;

/*-
 * #%L
 * Soot - a J*va Optimization Framework
 * %%
 * Copyright (C) 1997 Clark Verbrugge
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 2.1 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */

/**
 * A debugging attribute, this gives the name of the source file for this <tt>.class</tt> file.
 * 
 * @see attribute_info
 * @author Clark Verbrugge
 */
public class SourceFile_attribute extends attribute_info {
  /**
   * Constant pool index of a utf8 string for the name of the associated source file.
   * 
   * @see CONSTANT_Utf8_info
   */
  public int sourcefile_index;
}
