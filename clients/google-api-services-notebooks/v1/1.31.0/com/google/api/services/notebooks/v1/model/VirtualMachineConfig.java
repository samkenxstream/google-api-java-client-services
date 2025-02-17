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

package com.google.api.services.notebooks.v1.model;

/**
 * The config settings for virtual machine.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Notebooks API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VirtualMachineConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The Compute Engine accelerator configuration for this runtime.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RuntimeAcceleratorConfig acceleratorConfig;

  /**
   * Optional. Boot image metadata used for runtime upgradeability.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BootImage bootImage;

  /**
   * Optional. Use a list of container images to use as Kernels in the notebook instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ContainerImage> containerImages;

  static {
    // hack to force ProGuard to consider ContainerImage used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ContainerImage.class);
  }

  /**
   * Required. Data disk option configuration settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LocalDisk dataDisk;

  /**
   * Optional. Encryption settings for virtual machine data disk.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EncryptionConfig encryptionConfig;

  /**
   * Output only. The Compute Engine guest attributes. (see [Project and instance guest
   * attributes](https://cloud.google.com/compute/docs/storing-retrieving-
   * metadata#guest_attributes)).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> guestAttributes;

  /**
   * Optional. If true, runtime will only have internal IP addresses. By default, runtimes are not
   * restricted to internal IP addresses, and will have ephemeral external IP addresses assigned to
   * each vm. This `internal_ip_only` restriction can only be enabled for subnetwork enabled
   * networks, and all dependencies must be configured to be accessible without external IP
   * addresses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean internalIpOnly;

  /**
   * Optional. The labels to associate with this runtime. Label **keys** must contain 1 to 63
   * characters, and must conform to [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt). Label
   * **values** may be empty, but, if present, must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with
   * a cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Required. The Compute Engine machine type used for runtimes. Short name is valid. Examples: *
   * `n1-standard-2` * `e2-standard-8`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String machineType;

  /**
   * Optional. The Compute Engine metadata entries to add to virtual machine. (see [Project and
   * instance metadata](https://cloud.google.com/compute/docs/storing-retrieving-
   * metadata#project_and_instance_metadata)).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> metadata;

  /**
   * Optional. The Compute Engine network to be used for machine communications. Cannot be specified
   * with subnetwork. If neither `network` nor `subnet` is specified, the "default" network of the
   * project is used, if it exists. A full URL or partial URI. Examples: *
   * `https://www.googleapis.com/compute/v1/projects/[project_id]/regions/global/default` *
   * `projects/[project_id]/regions/global/default` Runtimes are managed resources inside Google
   * Infrastructure. Runtimes support the following network configurations: * Google Managed Network
   * (Network & subnet are empty) * Consumer Project VPC (network & subnet are required). Requires
   * configuring Private Service Access. * Shared VPC (network & subnet are required). Requires
   * configuring Private Service Access.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String network;

  /**
   * Optional. The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nicType;

  /**
   * Optional. Reserved IP Range name is used for VPC Peering. The subnetwork allocation will use
   * the range *name* if it's assigned. Example: managed-notebooks-range-c PEERING_RANGE_NAME_3
   * =managed-notebooks-range-c gcloud compute addresses create $PEERING_RANGE_NAME_3 \ --global \
   * --prefix-length=24 \ --description="Google Cloud Managed Notebooks Range 24 c" \
   * --network=$NETWORK \ --addresses=192.168.0.0 \ --purpose=VPC_PEERING Field value will be:
   * `managed-notebooks-range-c`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reservedIpRange;

  /**
   * Optional. Shielded VM Instance configuration settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RuntimeShieldedInstanceConfig shieldedInstanceConfig;

  /**
   * Optional. The Compute Engine subnetwork to be used for machine communications. Cannot be
   * specified with network. A full URL or partial URI are valid. Examples: *
   * `https://www.googleapis.com/compute/v1/projects/[project_id]/regions/us-east1/subnetworks/sub0`
   * * `projects/[project_id]/regions/us-east1/subnetworks/sub0`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subnet;

  /**
   * Optional. The Compute Engine tags to add to runtime (see [Tagging
   * instances](https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> tags;

  /**
   * Output only. The zone where the virtual machine is located. If using regional request, the
   * notebooks service will pick a location in the corresponding runtime region. On a get request,
   * zone will always be present. Example: * `us-central1-b`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * Optional. The Compute Engine accelerator configuration for this runtime.
   * @return value or {@code null} for none
   */
  public RuntimeAcceleratorConfig getAcceleratorConfig() {
    return acceleratorConfig;
  }

  /**
   * Optional. The Compute Engine accelerator configuration for this runtime.
   * @param acceleratorConfig acceleratorConfig or {@code null} for none
   */
  public VirtualMachineConfig setAcceleratorConfig(RuntimeAcceleratorConfig acceleratorConfig) {
    this.acceleratorConfig = acceleratorConfig;
    return this;
  }

  /**
   * Optional. Boot image metadata used for runtime upgradeability.
   * @return value or {@code null} for none
   */
  public BootImage getBootImage() {
    return bootImage;
  }

  /**
   * Optional. Boot image metadata used for runtime upgradeability.
   * @param bootImage bootImage or {@code null} for none
   */
  public VirtualMachineConfig setBootImage(BootImage bootImage) {
    this.bootImage = bootImage;
    return this;
  }

  /**
   * Optional. Use a list of container images to use as Kernels in the notebook instance.
   * @return value or {@code null} for none
   */
  public java.util.List<ContainerImage> getContainerImages() {
    return containerImages;
  }

  /**
   * Optional. Use a list of container images to use as Kernels in the notebook instance.
   * @param containerImages containerImages or {@code null} for none
   */
  public VirtualMachineConfig setContainerImages(java.util.List<ContainerImage> containerImages) {
    this.containerImages = containerImages;
    return this;
  }

  /**
   * Required. Data disk option configuration settings.
   * @return value or {@code null} for none
   */
  public LocalDisk getDataDisk() {
    return dataDisk;
  }

  /**
   * Required. Data disk option configuration settings.
   * @param dataDisk dataDisk or {@code null} for none
   */
  public VirtualMachineConfig setDataDisk(LocalDisk dataDisk) {
    this.dataDisk = dataDisk;
    return this;
  }

  /**
   * Optional. Encryption settings for virtual machine data disk.
   * @return value or {@code null} for none
   */
  public EncryptionConfig getEncryptionConfig() {
    return encryptionConfig;
  }

  /**
   * Optional. Encryption settings for virtual machine data disk.
   * @param encryptionConfig encryptionConfig or {@code null} for none
   */
  public VirtualMachineConfig setEncryptionConfig(EncryptionConfig encryptionConfig) {
    this.encryptionConfig = encryptionConfig;
    return this;
  }

  /**
   * Output only. The Compute Engine guest attributes. (see [Project and instance guest
   * attributes](https://cloud.google.com/compute/docs/storing-retrieving-
   * metadata#guest_attributes)).
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getGuestAttributes() {
    return guestAttributes;
  }

  /**
   * Output only. The Compute Engine guest attributes. (see [Project and instance guest
   * attributes](https://cloud.google.com/compute/docs/storing-retrieving-
   * metadata#guest_attributes)).
   * @param guestAttributes guestAttributes or {@code null} for none
   */
  public VirtualMachineConfig setGuestAttributes(java.util.Map<String, java.lang.String> guestAttributes) {
    this.guestAttributes = guestAttributes;
    return this;
  }

  /**
   * Optional. If true, runtime will only have internal IP addresses. By default, runtimes are not
   * restricted to internal IP addresses, and will have ephemeral external IP addresses assigned to
   * each vm. This `internal_ip_only` restriction can only be enabled for subnetwork enabled
   * networks, and all dependencies must be configured to be accessible without external IP
   * addresses.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getInternalIpOnly() {
    return internalIpOnly;
  }

  /**
   * Optional. If true, runtime will only have internal IP addresses. By default, runtimes are not
   * restricted to internal IP addresses, and will have ephemeral external IP addresses assigned to
   * each vm. This `internal_ip_only` restriction can only be enabled for subnetwork enabled
   * networks, and all dependencies must be configured to be accessible without external IP
   * addresses.
   * @param internalIpOnly internalIpOnly or {@code null} for none
   */
  public VirtualMachineConfig setInternalIpOnly(java.lang.Boolean internalIpOnly) {
    this.internalIpOnly = internalIpOnly;
    return this;
  }

  /**
   * Optional. The labels to associate with this runtime. Label **keys** must contain 1 to 63
   * characters, and must conform to [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt). Label
   * **values** may be empty, but, if present, must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with
   * a cluster.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. The labels to associate with this runtime. Label **keys** must contain 1 to 63
   * characters, and must conform to [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt). Label
   * **values** may be empty, but, if present, must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with
   * a cluster.
   * @param labels labels or {@code null} for none
   */
  public VirtualMachineConfig setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Required. The Compute Engine machine type used for runtimes. Short name is valid. Examples: *
   * `n1-standard-2` * `e2-standard-8`
   * @return value or {@code null} for none
   */
  public java.lang.String getMachineType() {
    return machineType;
  }

  /**
   * Required. The Compute Engine machine type used for runtimes. Short name is valid. Examples: *
   * `n1-standard-2` * `e2-standard-8`
   * @param machineType machineType or {@code null} for none
   */
  public VirtualMachineConfig setMachineType(java.lang.String machineType) {
    this.machineType = machineType;
    return this;
  }

  /**
   * Optional. The Compute Engine metadata entries to add to virtual machine. (see [Project and
   * instance metadata](https://cloud.google.com/compute/docs/storing-retrieving-
   * metadata#project_and_instance_metadata)).
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getMetadata() {
    return metadata;
  }

  /**
   * Optional. The Compute Engine metadata entries to add to virtual machine. (see [Project and
   * instance metadata](https://cloud.google.com/compute/docs/storing-retrieving-
   * metadata#project_and_instance_metadata)).
   * @param metadata metadata or {@code null} for none
   */
  public VirtualMachineConfig setMetadata(java.util.Map<String, java.lang.String> metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Optional. The Compute Engine network to be used for machine communications. Cannot be specified
   * with subnetwork. If neither `network` nor `subnet` is specified, the "default" network of the
   * project is used, if it exists. A full URL or partial URI. Examples: *
   * `https://www.googleapis.com/compute/v1/projects/[project_id]/regions/global/default` *
   * `projects/[project_id]/regions/global/default` Runtimes are managed resources inside Google
   * Infrastructure. Runtimes support the following network configurations: * Google Managed Network
   * (Network & subnet are empty) * Consumer Project VPC (network & subnet are required). Requires
   * configuring Private Service Access. * Shared VPC (network & subnet are required). Requires
   * configuring Private Service Access.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetwork() {
    return network;
  }

  /**
   * Optional. The Compute Engine network to be used for machine communications. Cannot be specified
   * with subnetwork. If neither `network` nor `subnet` is specified, the "default" network of the
   * project is used, if it exists. A full URL or partial URI. Examples: *
   * `https://www.googleapis.com/compute/v1/projects/[project_id]/regions/global/default` *
   * `projects/[project_id]/regions/global/default` Runtimes are managed resources inside Google
   * Infrastructure. Runtimes support the following network configurations: * Google Managed Network
   * (Network & subnet are empty) * Consumer Project VPC (network & subnet are required). Requires
   * configuring Private Service Access. * Shared VPC (network & subnet are required). Requires
   * configuring Private Service Access.
   * @param network network or {@code null} for none
   */
  public VirtualMachineConfig setNetwork(java.lang.String network) {
    this.network = network;
    return this;
  }

  /**
   * Optional. The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
   * @return value or {@code null} for none
   */
  public java.lang.String getNicType() {
    return nicType;
  }

  /**
   * Optional. The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
   * @param nicType nicType or {@code null} for none
   */
  public VirtualMachineConfig setNicType(java.lang.String nicType) {
    this.nicType = nicType;
    return this;
  }

  /**
   * Optional. Reserved IP Range name is used for VPC Peering. The subnetwork allocation will use
   * the range *name* if it's assigned. Example: managed-notebooks-range-c PEERING_RANGE_NAME_3
   * =managed-notebooks-range-c gcloud compute addresses create $PEERING_RANGE_NAME_3 \ --global \
   * --prefix-length=24 \ --description="Google Cloud Managed Notebooks Range 24 c" \
   * --network=$NETWORK \ --addresses=192.168.0.0 \ --purpose=VPC_PEERING Field value will be:
   * `managed-notebooks-range-c`
   * @return value or {@code null} for none
   */
  public java.lang.String getReservedIpRange() {
    return reservedIpRange;
  }

  /**
   * Optional. Reserved IP Range name is used for VPC Peering. The subnetwork allocation will use
   * the range *name* if it's assigned. Example: managed-notebooks-range-c PEERING_RANGE_NAME_3
   * =managed-notebooks-range-c gcloud compute addresses create $PEERING_RANGE_NAME_3 \ --global \
   * --prefix-length=24 \ --description="Google Cloud Managed Notebooks Range 24 c" \
   * --network=$NETWORK \ --addresses=192.168.0.0 \ --purpose=VPC_PEERING Field value will be:
   * `managed-notebooks-range-c`
   * @param reservedIpRange reservedIpRange or {@code null} for none
   */
  public VirtualMachineConfig setReservedIpRange(java.lang.String reservedIpRange) {
    this.reservedIpRange = reservedIpRange;
    return this;
  }

  /**
   * Optional. Shielded VM Instance configuration settings.
   * @return value or {@code null} for none
   */
  public RuntimeShieldedInstanceConfig getShieldedInstanceConfig() {
    return shieldedInstanceConfig;
  }

  /**
   * Optional. Shielded VM Instance configuration settings.
   * @param shieldedInstanceConfig shieldedInstanceConfig or {@code null} for none
   */
  public VirtualMachineConfig setShieldedInstanceConfig(RuntimeShieldedInstanceConfig shieldedInstanceConfig) {
    this.shieldedInstanceConfig = shieldedInstanceConfig;
    return this;
  }

  /**
   * Optional. The Compute Engine subnetwork to be used for machine communications. Cannot be
   * specified with network. A full URL or partial URI are valid. Examples: *
   * `https://www.googleapis.com/compute/v1/projects/[project_id]/regions/us-east1/subnetworks/sub0`
   * * `projects/[project_id]/regions/us-east1/subnetworks/sub0`
   * @return value or {@code null} for none
   */
  public java.lang.String getSubnet() {
    return subnet;
  }

  /**
   * Optional. The Compute Engine subnetwork to be used for machine communications. Cannot be
   * specified with network. A full URL or partial URI are valid. Examples: *
   * `https://www.googleapis.com/compute/v1/projects/[project_id]/regions/us-east1/subnetworks/sub0`
   * * `projects/[project_id]/regions/us-east1/subnetworks/sub0`
   * @param subnet subnet or {@code null} for none
   */
  public VirtualMachineConfig setSubnet(java.lang.String subnet) {
    this.subnet = subnet;
    return this;
  }

  /**
   * Optional. The Compute Engine tags to add to runtime (see [Tagging
   * instances](https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTags() {
    return tags;
  }

  /**
   * Optional. The Compute Engine tags to add to runtime (see [Tagging
   * instances](https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
   * @param tags tags or {@code null} for none
   */
  public VirtualMachineConfig setTags(java.util.List<java.lang.String> tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Output only. The zone where the virtual machine is located. If using regional request, the
   * notebooks service will pick a location in the corresponding runtime region. On a get request,
   * zone will always be present. Example: * `us-central1-b`
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * Output only. The zone where the virtual machine is located. If using regional request, the
   * notebooks service will pick a location in the corresponding runtime region. On a get request,
   * zone will always be present. Example: * `us-central1-b`
   * @param zone zone or {@code null} for none
   */
  public VirtualMachineConfig setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public VirtualMachineConfig set(String fieldName, Object value) {
    return (VirtualMachineConfig) super.set(fieldName, value);
  }

  @Override
  public VirtualMachineConfig clone() {
    return (VirtualMachineConfig) super.clone();
  }

}
