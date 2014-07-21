/* 
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.olingo.fit.proxy.v4.demo.odatademo;

//CHECKSTYLE:OFF (Maven checkstyle)
import org.apache.olingo.ext.proxy.api.PersistenceManager;
import org.apache.olingo.ext.proxy.api.OperationType;
//CHECKSTYLE:ON (Maven checkstyle)

@org.apache.olingo.ext.proxy.api.annotations.Namespace("ODataDemo")
@org.apache.olingo.ext.proxy.api.annotations.EntityContainer(name = "DemoService",
  namespace = "ODataDemo",
  isDefaultEntityContainer = true)
public interface DemoService extends PersistenceManager {

    Products getProducts();

    Advertisements getAdvertisements();

    Persons getPersons();

    Categories getCategories();

    PersonDetails getPersonDetails();

    Suppliers getSuppliers();

    ProductDetails getProductDetails();




  Operations operations();

  public interface Operations {
  
        @org.apache.olingo.ext.proxy.api.annotations.Operation(name = "IncreaseSalaries",
                    type = OperationType.ACTION)
  void increaseSalaries(
        @org.apache.olingo.ext.proxy.api.annotations.Parameter(name = "percentage", type = "Edm.Int32", nullable = false) java.lang.Integer percentage
    );
  
      }   
}