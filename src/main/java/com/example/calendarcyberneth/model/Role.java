package com.example.calendarcyberneth.model;

import com.example.calendarcyberneth.roles.ERole;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @SequenceGenerator(name = "role_seq",sequenceName = "role_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "role_seq")
    @Column(name = "id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "name",length = 20)
    private ERole name;

    @ManyToMany(fetch = FetchType.LAZY,cascade = {CascadeType.ALL},mappedBy = "roles")
    private Set<User> users = new HashSet<>();



}
