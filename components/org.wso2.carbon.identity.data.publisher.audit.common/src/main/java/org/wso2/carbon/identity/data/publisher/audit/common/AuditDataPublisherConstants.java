/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.data.publisher.audit.common;

/**
 * Audit data publisher related constants.
 */
public class AuditDataPublisherConstants {
    public static final String USER_MGT_DAS_DATA_PUBLISHER = "userOperationDataDASPublisher";
    public static final String USER_OPERATION_EVENT_STREAM_NAME = "org.wso2.is.analytics.stream.OverallUserData:1.0.0";

    public static final String NOT_AVAILABLE = "NOT_AVAILABLE";
    public static final String TENANT_ID = "TENANT_ID";

    private AuditDataPublisherConstants() {     // Prevent initializing
    }
}
