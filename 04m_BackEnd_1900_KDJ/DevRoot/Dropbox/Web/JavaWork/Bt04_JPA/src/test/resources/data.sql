call next value for hibernate_sequence;   -- AI 값 증가
insert into users (`id`, `name`, `email`, `created_at`, `updated_at`) values (1, 'martin', 'martin@redknight.com', now(), now());

call next value for hibernate_sequence;
insert into users (`id`, `name`, `email`, `created_at`, `updated_at`) values (2, 'dennis', 'dennis@reddragon.com', now(), now());

call next value for hibernate_sequence;
insert into users (`id`, `name`, `email`, `created_at`, `updated_at`) values (3, 'sophia', 'sophia@blueknight.com', now(), now());

call next value for hibernate_sequence;
insert into users (`id`, `name`, `email`, `created_at`, `updated_at`) values (4, 'james', 'james@bluedragon.com', now(), now());

call next value for hibernate_sequence;
insert into users (`id`, `name`, `email`, `created_at`, `updated_at`) values (5, 'martin', 'martin@another.com', now(), now());


