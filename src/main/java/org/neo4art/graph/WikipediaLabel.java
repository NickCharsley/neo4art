/**
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.neo4art.graph;

import org.neo4j.graphdb.Label;

/**
 * @author Lorenzo Speranzoni
 * @since 29 Mar 2015
 */
public enum WikipediaLabel implements Label {

  WIKIPEDIA_ARTIST_PAGE,
  WIKIPEDIA_ARTWORK_PAGE,
  WIKIPEDIA_CATEGORY,
  WIKIPEDIA_FILE,
  WIKIPEDIA_GENERIC,
  WIKIPEDIA_MUSEUM_PAGE,
  WIKIPEDIA,
  WIKIPEDIA_PAGE,
  WIKIPEDIA_PROJECT,
  WIKIPEDIA_TEMPLATE

}
