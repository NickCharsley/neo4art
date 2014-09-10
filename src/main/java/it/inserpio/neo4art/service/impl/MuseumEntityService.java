/*
 * Copyright 2014 the original author or authors.
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

package it.inserpio.neo4art.service.impl;

import it.inserpio.neo4art.domain.Museum;
import it.inserpio.neo4art.repository.MuseumRepository;
import it.inserpio.neo4art.service.MuseumService;

import java.util.List;

import org.apache.commons.collections.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Circle;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Metrics;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Lorenzo Speranzoni
 * @since Mar 26, 2014
 */
@Service
public class MuseumEntityService implements MuseumService
{
  @Autowired
  private MuseumRepository museumRepository;
  
  /* (non-Javadoc)
   * @see it.inserpio.neo4art.service.MuseumService#getMuseumsWithinDistance(double, double, double)
   */
  @Override
  @Transactional
  @SuppressWarnings("unchecked")
  public List<Museum> getMuseumsWithinDistance(double longitude, double latitude, double distanceInKm)
  {
<<<<<<< HEAD
    Circle circle = new Circle(new Point(longitude, latitude), new Distance(distanceInKm, Metrics.KILOMETERS));
=======
    Point point = new Point(longitude, latitude);

	Distance distance = new Distance(distanceInKm, Metrics.KILOMETERS);
	
	Circle circle = new Circle(point, distance);
>>>>>>> branch 'spring-gx-dallas-2014' of https://github.com/inserpio/neo4art.git

	return IteratorUtils.toList(this.museumRepository.findWithinDistance(MuseumRepository.MUSEUM_GEOSPATIAL_INDEX, circle).iterator());
  }

}
