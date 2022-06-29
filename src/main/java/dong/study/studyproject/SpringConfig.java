package dong.study.studyproject;

import dong.study.studyproject.repository.MemberRepository;
import dong.study.studyproject.repository.MemoryMemberRepository;
import dong.study.studyproject.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}