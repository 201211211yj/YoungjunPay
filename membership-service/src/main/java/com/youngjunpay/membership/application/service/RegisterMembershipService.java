package com.youngjunpay.membership.application.service;

import com.youngjunpay.membership.application.port.in.RegisterMembershipUseCase;
import com.youngjunpay.membership.application.port.in.command.RegisterMembershipCommand;
import com.youngjunpay.membership.application.port.out.RegisterMembershipPort;
import com.youngjunpay.membership.domain.Membership;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RegisterMembershipService implements RegisterMembershipUseCase {

    private final RegisterMembershipPort registerMembershipPort;
    @Override
    public Membership registerMembership(RegisterMembershipCommand command) {

        registerMembershipPort.createMembership(
                new Membership.MembershipName(command.getName()),
                new Membership.MembershipEmail(command.getEmail()),
                new Membership.MembershipAddress(command.getAddress()),
                new Membership.MembershipIsValid(command.isValid()),
                new Membership.MembershipIsCorp(command.isCorp())
        );


        return null;
    }
}
