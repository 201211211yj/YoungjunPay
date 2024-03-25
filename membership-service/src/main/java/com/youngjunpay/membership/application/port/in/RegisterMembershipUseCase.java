package com.youngjunpay.membership.application.port.in;

import com.youngjunpay.membership.application.port.in.command.RegisterMembershipCommand;
import com.youngjunpay.membership.domain.Membership;
import common.UseCase;

@UseCase
public interface RegisterMembershipUseCase {
    Membership registerMembership(RegisterMembershipCommand command);
}
