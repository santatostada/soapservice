package service;

import localhost._1050.users.*;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserEndpoint {
	private static final String NAMESPACE_URI = "http://localhost:1050/users";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "addUserRequest")
	@ResponsePayload
	public AddUserResponse addUser(@RequestPayload AddUserRequest request) {
		AddUserResponse response = new AddUserResponse();
		response.setIsAdded("Yes");

		return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getUserRequest")
	@ResponsePayload
	public GetUserResponse getUser(@RequestPayload GetUserRequest request) {
		GetUserResponse response = new GetUserResponse();
		response.setId("1");
		response.setName("Raf");

		return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteUserRequest")
	@ResponsePayload
	public DeleteUserResponse deleteUser(@RequestPayload DeleteUserRequest request) {
		DeleteUserResponse response = new DeleteUserResponse();
		response.setIsDeleted("deleted");

		return response;
	}
}
