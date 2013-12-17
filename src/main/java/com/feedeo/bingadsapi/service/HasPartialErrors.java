package com.feedeo.bingadsapi.service;

import com.microsoft.bingads.v9.campaignmanagement.BatchError;

/**
 * User: maglju
 * Date: 2013-12-17
 * Time: 13:46
 */
public interface HasPartialErrors {
    public BatchError[] getPartialErrors();
}
