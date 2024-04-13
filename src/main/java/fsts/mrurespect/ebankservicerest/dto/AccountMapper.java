package fsts.mrurespect.ebankservicerest.dto;

import fsts.mrurespect.ebankservicerest.entity.Account;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

@Component
public class AccountMapper {
    public static Account mapToEntity(AccountRequestDto accountDto) {
        return Account.builder()
                .id(UUID.randomUUID().toString())
                .createDate(new Date())
                .currency(accountDto.getCurrency())
                .balance(accountDto.getBalance())
                .accountType(accountDto.getAccountType())
                .build();
    }
    public static AccountResponseDto mapToDto(Account account) {
        return AccountResponseDto.builder()
                .id(account.getId())
                .createDate(account.getCreateDate())
                .currency(account.getCurrency())
                .balance(account.getBalance())
                .accountType(account.getAccountType())
                .build();
    }
}
