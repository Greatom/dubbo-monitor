/**
 * Copyright 2006-2015 handu.com
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
package com.handu.open.dubbo.monitor.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.util.StringUtils;

import java.io.Serializable;
import java.util.Date;

/**
 * Dubbo Invoke Base Entity
 *
 * @author Zhiguo.Chen <me@chenzhiguo.cn>
 *         Created on 15/6/29.
 */
public class DubboInvoke implements Serializable {

    private String id;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date invokeDate;

    private String service;

    private String method;

    private String consumer;

    private String provider;

    private String type;

    private double success;

    private double failure;

    private double elapsed;

    private double concurrent;

    private double maxElapsed;

    private double maxConcurrent;

    private long invokeTime;

    // ====================查询辅助参数===================
    /**
     * 统计时间粒度(毫秒)
     */
    private Long timeParticle = 60000L;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date invokeDateFrom;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date invokeDateTo;

    public Date getInvokeDate() {
        return invokeDate;
    }

    public void setInvokeDate(Date invokeDate) {
        this.invokeDate = invokeDate;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getConsumer() {
        return consumer;
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getType() {
        if (StringUtils.isEmpty(type)) {
            return "provider";
        }
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getTimeParticle() {
        return timeParticle;
    }

    public void setTimeParticle(Long timeParticle) {
        this.timeParticle = timeParticle;
    }

    public Date getInvokeDateFrom() {
        return invokeDateFrom;
    }

    public void setInvokeDateFrom(Date invokeDateFrom) {
        this.invokeDateFrom = invokeDateFrom;
    }

    public Date getInvokeDateTo() {
        return invokeDateTo;
    }

    public void setInvokeDateTo(Date invokeDateTo) {
        this.invokeDateTo = invokeDateTo;
    }


    public double getSuccess() {
        return success;
    }

    public void setSuccess(double success) {
        this.success = success;
    }

    public double getFailure() {
        return failure;
    }

    public void setFailure(double failure) {
        this.failure = failure;
    }

    public double getElapsed() {
        return elapsed;
    }

    public void setElapsed(double elapsed) {
        this.elapsed = elapsed;
    }

    public double getConcurrent() {
        return concurrent;
    }

    public void setConcurrent(double concurrent) {
        this.concurrent = concurrent;
    }

    public double getMaxElapsed() {
        return maxElapsed;
    }

    public void setMaxElapsed(double maxElapsed) {
        this.maxElapsed = maxElapsed;
    }

    public double getMaxConcurrent() {
        return maxConcurrent;
    }

    public void setMaxConcurrent(double maxConcurrent) {
        this.maxConcurrent = maxConcurrent;
    }

    public void setTimeParticle(long timeParticle) {
        this.timeParticle = timeParticle;
    }

    public long getInvokeTime() {
        return invokeTime;
    }

    public void setInvokeTime(long invokeTime) {
        this.invokeTime = invokeTime;
    }
}
