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

package com.google.api.services.eventarc.v1.model;

/**
 * A representation of the Channel resource. A Channel is a resource on which event providers
 * publish their events. The published events are delivered through the transport associated with
 * the channel. Note that a channel is associated with exactly one event provider.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Eventarc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Channel extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The activation token for the channel. The token must be used by the provider to
   * register the channel for publishing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String activationToken;

  /**
   * Output only. The creation time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Required. The resource name of the channel. Must be unique within the location on the project
   * and must be in `projects/{project}/locations/{location}/channels/{channel_id}` format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The name of the event provider (e.g. Eventarc SaaS partner) associated with the channel. This
   * provider will be granted permissions to publish events to the channel. Format:
   * `projects/{project}/locations/{location}/providers/{provider_id}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String provider;

  /**
   * Output only. The name of the Pub/Sub topic created and managed by Eventarc system as a
   * transport for the event delivery. Format: `projects/{project}/topics/{topic_id}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pubsubTopic;

  /**
   * Output only. The state of a Channel.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. Server assigned unique identifier for the channel. The value is a UUID4 string and
   * guaranteed to remain unchanged until the resource is deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uid;

  /**
   * Output only. The last-modified time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The activation token for the channel. The token must be used by the provider to
   * register the channel for publishing.
   * @return value or {@code null} for none
   */
  public java.lang.String getActivationToken() {
    return activationToken;
  }

  /**
   * Output only. The activation token for the channel. The token must be used by the provider to
   * register the channel for publishing.
   * @param activationToken activationToken or {@code null} for none
   */
  public Channel setActivationToken(java.lang.String activationToken) {
    this.activationToken = activationToken;
    return this;
  }

  /**
   * Output only. The creation time.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The creation time.
   * @param createTime createTime or {@code null} for none
   */
  public Channel setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Required. The resource name of the channel. Must be unique within the location on the project
   * and must be in `projects/{project}/locations/{location}/channels/{channel_id}` format.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The resource name of the channel. Must be unique within the location on the project
   * and must be in `projects/{project}/locations/{location}/channels/{channel_id}` format.
   * @param name name or {@code null} for none
   */
  public Channel setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the event provider (e.g. Eventarc SaaS partner) associated with the channel. This
   * provider will be granted permissions to publish events to the channel. Format:
   * `projects/{project}/locations/{location}/providers/{provider_id}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getProvider() {
    return provider;
  }

  /**
   * The name of the event provider (e.g. Eventarc SaaS partner) associated with the channel. This
   * provider will be granted permissions to publish events to the channel. Format:
   * `projects/{project}/locations/{location}/providers/{provider_id}`.
   * @param provider provider or {@code null} for none
   */
  public Channel setProvider(java.lang.String provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Output only. The name of the Pub/Sub topic created and managed by Eventarc system as a
   * transport for the event delivery. Format: `projects/{project}/topics/{topic_id}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getPubsubTopic() {
    return pubsubTopic;
  }

  /**
   * Output only. The name of the Pub/Sub topic created and managed by Eventarc system as a
   * transport for the event delivery. Format: `projects/{project}/topics/{topic_id}`.
   * @param pubsubTopic pubsubTopic or {@code null} for none
   */
  public Channel setPubsubTopic(java.lang.String pubsubTopic) {
    this.pubsubTopic = pubsubTopic;
    return this;
  }

  /**
   * Output only. The state of a Channel.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The state of a Channel.
   * @param state state or {@code null} for none
   */
  public Channel setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. Server assigned unique identifier for the channel. The value is a UUID4 string and
   * guaranteed to remain unchanged until the resource is deleted.
   * @return value or {@code null} for none
   */
  public java.lang.String getUid() {
    return uid;
  }

  /**
   * Output only. Server assigned unique identifier for the channel. The value is a UUID4 string and
   * guaranteed to remain unchanged until the resource is deleted.
   * @param uid uid or {@code null} for none
   */
  public Channel setUid(java.lang.String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * Output only. The last-modified time.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The last-modified time.
   * @param updateTime updateTime or {@code null} for none
   */
  public Channel setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Channel set(String fieldName, Object value) {
    return (Channel) super.set(fieldName, value);
  }

  @Override
  public Channel clone() {
    return (Channel) super.clone();
  }

}
