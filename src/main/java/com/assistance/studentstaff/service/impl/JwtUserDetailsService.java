package com.assistance.studentstaff.service.impl;

import com.assistance.studentstaff.model.UserModel;
import com.assistance.studentstaff.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class JwtUserDetailsService implements UserDetailsService {

  @Autowired
  IUserRepo userRepo;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Optional<UserModel> userModel = userRepo.findByEmailIdOrMobileNo(username, null);
    if (userModel.isPresent()) {
      String emailId = userModel.get().getEmailId();
      String password = userModel.get().getPassword();
      return new User(emailId, password, new ArrayList<>());
    } else {
      throw new UsernameNotFoundException("User not found with username: " + username);
    }
  }
}
