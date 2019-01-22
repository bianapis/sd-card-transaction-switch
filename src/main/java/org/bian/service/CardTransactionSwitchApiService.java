/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CardTransactionSwitchApiService {

	CardTransactionSwitchCaptureResponse executePostCapture(String crReferenceId, CardTransactionSwitchCaptureRequest request);
	
	CardTransactionSwitchCaptureResponse executePutCapture(String crReferenceId, String bqReferenceId, CardTransactionSwitchCaptureRequest request);
	
	CardTransactionSwitchRecordResponse record(String crReferenceId, CardTransactionSwitchRecordRequest request);
	
	CardTransactionSwitchResponse retrieve(String crReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	CardTransactionSwitchCaptureResponse retrieveCapture(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
	CardTransactionSwitchRoutingResponse retrieveRoutings(String crReferenceId, String bqReferenceId);
	
}
