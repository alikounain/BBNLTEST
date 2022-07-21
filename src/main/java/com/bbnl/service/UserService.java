package com.bbnl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.bbnl.entity.PasswordResetToken;
import com.bbnl.entity.User;
import com.bbnl.entity.VerificationToken;
import com.bbnl.exception.EmailExistsException;
import com.bbnl.repository.UserRepository;
import com.bbnl.repository.PasswordResetTokenRepository;
import com.bbnl.repository.VerificationTokenRepository;

@Service
public class UserService implements IUserService {
	
	@Autowired
	private UserRepository repo;
	
	 @Autowired
	    private PasswordResetTokenRepository passwordTokenRepository;
	
	 @Autowired
	    private VerificationTokenRepository verificationTokenRepository;
	
	 @Autowired
	    private PasswordEncoder passwordEncoder;
	 
	 private boolean emailExist(final String email) {
	        final User user = repo.findByEmail(email);
	        return user != null;
	    }
	
	public List<User> listAllUser() {
		return repo.findAll();
	}
	
	public User saveUser(User user) {
		return repo.save(user);
	}
	
	public void deleteUser(String id) {
		repo.deleteById(id);
	}

	@Override
	public User findUserByEmail(String email) {
		
		System.out.println("override"+email);
		return repo.findByEmail(email);
	}

	@Override
	public User registerNewUser(User user) throws EmailExistsException {
		if (emailExist(user.getEmail())) {
            throw new EmailExistsException("There is an account with that email address: " + user.getEmail());
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return repo.save(user);
}
	

	

	@Override
	public VerificationToken getVerificationToken(String token) {
		System.out.println("token at override"+token);
		 return verificationTokenRepository.findByToken(token);
	}

	@Override
	public void createVerificationTokenForUser(User user, String token) {
		 final VerificationToken myToken = new VerificationToken(token, user);
	        verificationTokenRepository.save(myToken);
		
	}

	@Override
	public void createPasswordResetTokenForUser(User user, String token) {
		final PasswordResetToken myToken = new PasswordResetToken(token, user);
        passwordTokenRepository.save(myToken);
		
	}

	@Override
	public void changeUserPassword(User user, String password) {
		user.setPassword(passwordEncoder.encode(password));
        repo.save(user);
		
	}

	@Override
	public void saveRegisteredUser(User user) {
		 repo.save(user);
		
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PasswordResetToken getPasswordResetToken(String token) {
		return passwordTokenRepository.findByToken(token);
	}

	/*
	 * @Override public User findByToken(String token) {
	 * System.out.println("token at override"+token); return
	 * repo.findByToken(token); }
	 */
}
