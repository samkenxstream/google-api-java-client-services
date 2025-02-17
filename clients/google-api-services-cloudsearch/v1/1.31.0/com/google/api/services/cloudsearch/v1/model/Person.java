/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.cloudsearch.v1.model;

/**
 * Object to represent a person.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Person extends com.google.api.client.json.GenericJson {

  /**
   * The person's email addresses
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EmailAddress> emailAddresses;

  static {
    // hack to force ProGuard to consider EmailAddress used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(EmailAddress.class);
  }

  /**
   * The resource name of the person to provide information about. See
   * [`People.get`](https://developers.google.com/people/api/rest/v1/people/get) from the Google
   * People API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Obfuscated ID of a person.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String obfuscatedId;

  /**
   * The person's name
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Name> personNames;

  static {
    // hack to force ProGuard to consider Name used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Name.class);
  }

  /**
   * A person's read-only photo. A picture shown next to the person's name to help others recognize
   * the person in search results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Photo> photos;

  /**
   * The person's email addresses
   * @return value or {@code null} for none
   */
  public java.util.List<EmailAddress> getEmailAddresses() {
    return emailAddresses;
  }

  /**
   * The person's email addresses
   * @param emailAddresses emailAddresses or {@code null} for none
   */
  public Person setEmailAddresses(java.util.List<EmailAddress> emailAddresses) {
    this.emailAddresses = emailAddresses;
    return this;
  }

  /**
   * The resource name of the person to provide information about. See
   * [`People.get`](https://developers.google.com/people/api/rest/v1/people/get) from the Google
   * People API.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the person to provide information about. See
   * [`People.get`](https://developers.google.com/people/api/rest/v1/people/get) from the Google
   * People API.
   * @param name name or {@code null} for none
   */
  public Person setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Obfuscated ID of a person.
   * @return value or {@code null} for none
   */
  public java.lang.String getObfuscatedId() {
    return obfuscatedId;
  }

  /**
   * Obfuscated ID of a person.
   * @param obfuscatedId obfuscatedId or {@code null} for none
   */
  public Person setObfuscatedId(java.lang.String obfuscatedId) {
    this.obfuscatedId = obfuscatedId;
    return this;
  }

  /**
   * The person's name
   * @return value or {@code null} for none
   */
  public java.util.List<Name> getPersonNames() {
    return personNames;
  }

  /**
   * The person's name
   * @param personNames personNames or {@code null} for none
   */
  public Person setPersonNames(java.util.List<Name> personNames) {
    this.personNames = personNames;
    return this;
  }

  /**
   * A person's read-only photo. A picture shown next to the person's name to help others recognize
   * the person in search results.
   * @return value or {@code null} for none
   */
  public java.util.List<Photo> getPhotos() {
    return photos;
  }

  /**
   * A person's read-only photo. A picture shown next to the person's name to help others recognize
   * the person in search results.
   * @param photos photos or {@code null} for none
   */
  public Person setPhotos(java.util.List<Photo> photos) {
    this.photos = photos;
    return this;
  }

  @Override
  public Person set(String fieldName, Object value) {
    return (Person) super.set(fieldName, value);
  }

  @Override
  public Person clone() {
    return (Person) super.clone();
  }

}
