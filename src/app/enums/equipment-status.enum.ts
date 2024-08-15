export enum EquipmentStatus {
  ACTIVE = 'ACTIVE',
  INACTIVE = 'INACTIVE',
  UNDER_MAINTENANCE = 'UNDER_MAINTENANCE',
  DECOMMISSIONED = 'DECOMMISSIONED'
}

export const EquipmentStatusOptions = [
  { value: EquipmentStatus.ACTIVE, label: 'Active' },
  { value: EquipmentStatus.INACTIVE, label: 'Inactive' },
  { value: EquipmentStatus.UNDER_MAINTENANCE, label: 'Under Maintenance' },
  { value: EquipmentStatus.DECOMMISSIONED, label: 'Decommissioned' }
];
