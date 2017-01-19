/*
 * Copyright 2017 Miguel Zavala
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Purpose: Example classes conversion to/from json
 * This example shows the use of Android's
 * org.json package in creating json string of a Java object.
 *
 * Ser423 Mobile Applications
 * see http://pooh.poly.asu.edu/Mobile
 * @author Miguel Zavala miguel.zavala@asu.edu
 *         Software Engineering, CIDSE, IAFSE, ASU Poly
 * @version January 2017
 */
package com.example.mazaval4.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText name = (EditText)findViewById(R.id.editText);
        EditText des = (EditText)findViewById(R.id.editText2);
        EditText category = (EditText)findViewById(R.id.editText3);
        EditText addStreet = (EditText)findViewById(R.id.editText4);
        EditText addTitle = (EditText)findViewById(R.id.editText5);
        EditText longitude = (EditText)findViewById(R.id.editText6);
        EditText elevation = (EditText)findViewById(R.id.editText7);
        EditText latitude = (EditText)findViewById(R.id.editText8);

        PlaceDescription p = new PlaceDescription(name.getText().toString(),des.getText().toString(),
                category.getText().toString(),addStreet.getText().toString(),addTitle.getText().toString(),
                elevation.getText().toString(),latitude.getText().toString(),longitude.getText().toString());
    }

    public class PlaceDescription
    {
        private String name;
        private String description;
        private String category;
        private String address_title;
        private String address_street;
        private String elevation;
        private String latitude;
        private String longitude;

        public PlaceDescription()
        {}

        public PlaceDescription(String name, String description, String category, String address_street,
                                String address_title,String elevation, String latitude, String longitude)
        {
            this.name = name;
            this.description = description;
            this.category = category;
            this.address_street = address_street;
            this.address_title = address_title;
            this.elevation = elevation;
            this.latitude = latitude;
            this.longitude = longitude;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getAddress_title() {
            return address_title;
        }

        public void setAddress_title(String address_title) {
            this.address_title = address_title;
        }

        public String getAddress_street() {
            return address_street;
        }

        public void setAddress_street(String address_street) {
            this.address_street = address_street;
        }

        public String getElevation() {
            return elevation;
        }

        public void setElevation(String elevation) {
            this.elevation = elevation;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }
    }
}
