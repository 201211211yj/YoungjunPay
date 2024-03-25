package com.youngjunpay.membership.application.port.out;

import com.youngjunpay.membership.adapter.out.persistence.MembershipJpaEntity;
import com.youngjunpay.membership.domain.Membership;

public interface RegisterMembershipPort {


    MembershipJpaEntity createMembership(Membership.MembershipName membershipName, Membership.MembershipEmail membershipEmail, Membership.MembershipAddress membershipAddress, Membership.MembershipIsValid membershipIsValid, Membership.MembershipIsCorp membershipIsCorp);
}
