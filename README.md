# UserFast

## GROUP NO: 4
### FastPath

FastPath is a shopping app with inbuilt location facility with which the user can get to their
product location. The application generates a shortest path which comprises of all the items
the user wants to buy from that shop. This will save the user from going to and fro within
the rack.Also, there is an admin application which controls the product’s rack number, product’s
partition number, product’s location, product type, etc. within the shop.

### Getting Started
These instructions will help you get the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.
### Prerequisites
+ Android Studio 3.1.
### Installing
* For Mobile Phone:
  * For User:
    * Search “FastPath-User” in Android Google Play Store.
    * Download and Install the application in your mobile device.
  * For Admin:
    * Search “FastPath-Admin” in Android Google Play Store.
    * Download and Install the application in your mobile device.
* For Android developer:
  * In Android Studio , File -> New -> Project from Version Control -> GitHub.
  * Enter your GitHub Username and Password.
  * Select the repository and hit clone.  
  OR
  * Download the code from Github.
  * From the Android Studio menu click File > New > Import Project.
### Features
  * Camera OCR : Crop , Rotate, Binarize, Recognize Text, Search, Copy to clipboard.
  * Database : Google Firebase.
  * List : User can able to make list prior to visit the shop. Also there is a remaining list feature in which it contain all the item that a user didn’t purchase during their store visit.
  * Map : Create a path to the product and also create a shortest path which comprises of all the items that the user wants to buy from that shop.
  * Billing : Generate a bill after the user is done with shopping.
  * Account authorities : Login, Logout and Deactivate account.
### Libraries
  * Android-image-cropper: For image cropping.
  * Tess-two : To recognize text (tesseract) and binarize (leptonica).
  * Assets: eng.traineddata.
### Usage
  * Login.
  * Create list for shopping either by camera (to scan you list written on paper) or from list (populated from database).
  * If you don’t want to continue shopping the list will be automatically save into google firebase database and you can even load your item list from different mobile phone by simply login into your account.
  * If you want to shop then go to let’s shop option that will give you the list of all the items list you have created.
  * By selecting one list will shows the shortest path all all the items you want to buy.
  * When your shopping is over it will provide an list of items with checkbox and you can select which item did u buy during your visit. It might possible that the map shows the items but when you visit the shop that item is not at that quality. So, the user can drop that product.
  * On selecting the payment button the bill will be generated of the item that you purchase and the item that you didn’t purchase will be store in remaining items list for the user reference.
### Future Implementation
  * Integrating with different shop or store.
  * QR code or Barcode Scanner to get the item information.
  * Letting the user set a reminder to shop a list at a particular date and time using Push Notifications in Firebase.
  * Notify the user when they are near to the product.
  * Recommend the user to shop a list based on patterns found from Firebase Analytics.
  * Adding feature for online ordering.
### Support
  * Android 5.0+
### Current Version
  * 1.0
### ScreenShot
  * Please open readme.pdf file
### Developer
  * Shubham Amitkumar Patel
  * Sanika Lakka
  * Dimple Maniar
  * Bingxin Hou
### License
#### Android-image-cropper Library originally forked from edmodo/cropper .
Copyright 2016, Arthur Teplitzki, 2013, Edmodo, Inc.
#### Tess-two library :
Copyright 2011 Robert Theis
Licensed under the Apache License, Version 2.0 (the "License"); you may not use this work
except in compliance with the License. You may obtain a copy of the License in the
LICENSE file, or at:
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software distributed under the
License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
OF ANY KIND, either express or implied. See the License for the specific language
governing permissions and limitations under the License.
