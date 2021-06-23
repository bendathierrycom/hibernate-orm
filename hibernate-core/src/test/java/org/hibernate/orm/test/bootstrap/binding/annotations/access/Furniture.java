/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */

//$Id$
package org.hibernate.orm.test.bootstrap.binding.annotations.access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

import javax.persistence.Access;

/**
 * @author Emmanuel Bernard
 */
@Entity
@Access(AccessType.FIELD)
public class Furniture extends BaseFurniture {

}