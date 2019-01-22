/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CardTransactionSwitchApiServiceImpl implements CardTransactionSwitchApiService {

	public CardTransactionSwitchCaptureResponse executePostCapture(String crReferenceId, CardTransactionSwitchCaptureRequest request){
		return JsonReader.read("executePost-CardTransactionSwitchCaptureResponse.json",new TypeReference<CardTransactionSwitchCaptureResponse>(){});
	}
	
	public CardTransactionSwitchCaptureResponse executePutCapture(String crReferenceId, String bqReferenceId, CardTransactionSwitchCaptureRequest request){
		return JsonReader.read("executePut-CardTransactionSwitchCaptureResponse.json",new TypeReference<CardTransactionSwitchCaptureResponse>(){});
	}
	
	public CardTransactionSwitchRecordResponse record(String crReferenceId, CardTransactionSwitchRecordRequest request){
		return JsonReader.read("record-CardTransactionSwitchRecordResponse.json",new TypeReference<CardTransactionSwitchRecordResponse>(){});
	}
	
	public CardTransactionSwitchResponse retrieve(String crReferenceId){
		return JsonReader.read("retrieve-CardTransactionSwitchResponse.json",new TypeReference<CardTransactionSwitchResponse>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public CardTransactionSwitchCaptureResponse retrieveCapture(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CardTransactionSwitchCaptureResponse.json",new TypeReference<CardTransactionSwitchCaptureResponse>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public CardTransactionSwitchRoutingResponse retrieveRoutings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CardTransactionSwitchRoutingResponse.json",new TypeReference<CardTransactionSwitchRoutingResponse>(){});
	}
	
}
