package com.avaya.ava.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.avaya.ava.dto.AlexaMessage;
import com.avaya.ava.dto.CallLogs;


@Service
public class CallLogsService {
	private static RestTemplate restTemplate;

	static {
		restTemplate = new RestTemplate();
	}



	public CallLogs getCallLogs() {
		CallLogs callLog = new CallLogs();
		callLog.setIncomingCall(AlexaMessage.CallLogsIncomingCall);
		callLog.setMissCall(AlexaMessage.CallLogsMissCall);
		callLog.setOutGoingCall(AlexaMessage.CallLogsOutgoinCall);
		return callLog;
	}
}
