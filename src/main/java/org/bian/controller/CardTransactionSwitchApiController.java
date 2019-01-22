/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Operate;

@BianRestController
public class CardTransactionSwitchApiController {

	@Autowired
	CardTransactionSwitchApiService service;
	
	@BQ("capture")
	@Operate.ExecutePost
	public BianResponse<CardTransactionSwitchCaptureResponse> executePostCapture(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CardTransactionSwitchCaptureRequest> bianRequest) {
		return BianResponse.forSuccess(service.executePostCapture(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("capture")
	@Operate.ExecutePut
	public BianResponse<CardTransactionSwitchCaptureResponse> executePutCapture(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CardTransactionSwitchCaptureRequest> bianRequest) {
		return BianResponse.forSuccess(service.executePutCapture(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Operate.Record
	public BianResponse<CardTransactionSwitchRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CardTransactionSwitchRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@Operate.Retrieve
	public BianResponse<CardTransactionSwitchResponse> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Operate.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Operate.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("capture")
	@Operate.Retrieve
	public BianResponse<CardTransactionSwitchCaptureResponse> retrieveCapture(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCapture(crReferenceId, bqReferenceId));
	}
	
	@Operate.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("routings")
	@Operate.Retrieve
	public BianResponse<CardTransactionSwitchRoutingResponse> retrieveRoutings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRoutings(crReferenceId, bqReferenceId));
	}
	
}
