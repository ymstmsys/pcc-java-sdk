package jp.primecloud.auto.sdk.client.instance;

import java.util.LinkedHashMap;
import java.util.Map;

import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Requester;
import jp.primecloud.auto.sdk.model.instance.Instance;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;

public class DescribeInstance {

    protected Requester requester;

    public DescribeInstance(Requester requester) {
        this.requester = requester;
    }

    public Instance execute(Long instanceNo) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("InstanceNo", instanceNo.toString());

        JsonNode jsonNode = requester.execute("/DescribeInstance", parameters);
        jsonNode = JacksonUtils.getField(jsonNode, "Instance");

        return JacksonUtils.toObject(jsonNode, new TypeReference<Instance>() {
        });
    }

}
