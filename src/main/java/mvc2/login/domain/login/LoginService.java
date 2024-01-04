package mvc2.login.domain.login;

import lombok.RequiredArgsConstructor;
import mvc2.login.domain.member.Member;
import mvc2.login.domain.member.MemberRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final MemberRepository memberRepository;

    public Member login(String loginId, String password) {
        return memberRepository.findByLoginId(loginId).filter(m -> m.getPassword().equals(password))
                .orElse(null);
    }
}
