package com.youngjunpay.membership.adapter.in.web;

import com.youngjunpay.membership.application.port.in.RegisterMembershipUseCase;
import com.youngjunpay.membership.application.port.in.command.RegisterMembershipCommand;
import common.WebAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
@RequiredArgsConstructor
public class RegisterMemberController {

    private final RegisterMembershipUseCase registerMembershipUseCase;

    @PostMapping("/membership/register")
    void registerMembership(@RequestBody RegisterMembershipRequest request) {

        registerMembershipUseCase.registerMembership(RegisterMembershipCommand.builder()
                .name(request.getName())
                .address(request.getAddress())
                .email(request.getEmail())
                .isValid(true)
                .isCorp(request.isCorp())
                .build());

    }
}
