package com.kafkamgt.uiapi.model;

import lombok.Data;

import java.util.HashMap;
import java.util.List;

@Data
public class TopicOverview {
    List<TopicInfo> topicInfoList;
    List<AclInfo> aclInfoList;
    HashMap<String, String> promotionDetails;
    boolean topicExists;
}
