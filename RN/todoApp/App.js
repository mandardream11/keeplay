// App.js

import React, { useState, useEffect } from 'react';
import { View, Text, StyleSheet, TextInput, TouchableOpacity, ScrollView, Button, FlatList } from 'react-native';
import AsyncStorage from '@react-native-async-storage/async-storage';
import { NavigationContainer } from '@react-navigation/native';
import { createStackNavigator } from '@react-navigation/stack';

const HomeScreen = ({ navigation }) => {
  const [tasks, setTasks] = useState([]);
  const [taskText, setTaskText] = useState('');
  const [taskError, setTaskError] = useState('');

  useEffect(() => {
    // Load tasks from AsyncStorage when the component mounts
    loadTasks();
  }, []);

  const loadTasks = async () => {
    try {
      const storedTasks = await AsyncStorage.getItem('tasks');
      if (storedTasks !== null) {
        setTasks(JSON.parse(storedTasks));
      }
    } catch (error) {
      console.error('Error loading tasks:', error);
    }
  };

  const saveTasks = async (updatedTasks) => {
    try {
      await AsyncStorage.setItem('tasks', JSON.stringify(updatedTasks));
    } catch (error) {
      console.error('Error saving tasks:', error);
    }
  };

  const addTask = () => {
    if (taskText.trim() !== '') {
      const newTasks = [...tasks, { text: taskText, id: Date.now() }];
      setTaskError('');
      setTasks(newTasks);
      saveTasks(newTasks);
      setTaskText('');
    }
    else {
      setTaskError("Please enter a task.");
    }
  };

  const removeTask = (taskId) => {
    const updatedTasks = tasks.filter((task) => task.id !== taskId);
    setTasks(updatedTasks);
    saveTasks(updatedTasks);
  };

  return (
    <View style={styles.container}>
      <FlatList
        style={styles.scrollView}
        data={tasks.slice().reverse()}
        keyExtractor={(task) => task.id.toString()}
        renderItem={({ item: task }) => (
          <View style={styles.taskContainer} key={task.id}>
            <TouchableOpacity
              style={styles.taskText}
              onPress={() => navigation.navigate('Task Details', { taskText: task.text })}>
              <Text>{task.text}</Text>
            </TouchableOpacity>
            <TouchableOpacity
              onPress={() => removeTask(task.id)}
              style={styles.deleteButton}>
              <Text style={styles.deleteButtonText}>Delete</Text>
            </TouchableOpacity>
          </View>
        )}
      />

      <View style={styles.inputContainer}>

        <TextInput
          style={[
            styles.input,
            taskError !== '' && styles.inputErrorBorder]}
          placeholder="Add a task..."
          onChangeText={(text) => setTaskText(text)}
          value={taskText}
        />

        <TouchableOpacity style={styles.addButton} onPress={addTask}>
          <Text style={styles.addButtonText}>Add</Text>
        </TouchableOpacity>
      </View>
    </View>

  );
};

const TaskScreen = ({ route }) => {
  const { taskText } = route.params;

  return (
    <View style={{ flex: 1, justifyContent: 'center', alignItems: 'center' }}>
      <Text > {taskText} </Text>
    </View >
  );
};

const Stack = createStackNavigator();

const App = () => {
  return (
    <NavigationContainer>
      <Stack.Navigator>
        <Stack.Screen
          name="Home"
          component={HomeScreen}
        />
        <Stack.Screen
          name="Task Details"
          component={TaskScreen}
        />
      </Stack.Navigator>
    </NavigationContainer>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#f0f0f0',
  },
  scrollView: {
    flex: 1,
    marginTop: 20,
    paddingHorizontal: 20,
  },
  taskContainer: {
    flexDirection: 'row',
    alignItems: 'center', // Center children vertically
    justifyContent: 'space-between',
    backgroundColor: '#ffffff',
    borderRadius: 8,
    padding: 10,
    marginBottom: 10,
  },
  taskText: {
    flex: 1,
    fontSize: 16,
  },
  deleteButton: {
    backgroundColor: '#61dafb',
    borderRadius: 5,
    marginLeft: 10
  },
  deleteButtonText: {
    color: '#ffffff',
    fontSize: 16,
    padding: 5
  },
  inputContainer: {
    flexDirection: 'row',
    alignItems: 'center',
    justifyContent: 'space-between',
    padding: 20,
    borderTopWidth: 1,
    borderTopColor: '#cccccc',
    backgroundColor: '#ffffff',
  },
  inputErrorBorder: {
    borderColor: 'red'
  },
  inputWrapper: {
    flex: 1,
  },
  input: {
    flex: 1,
    height: 40,
    marginRight: 10,
    paddingLeft: 10,
    borderColor: '#cccccc',
    borderWidth: 1,
    borderRadius: 5,
  },
  errorContainer: {
    marginTop: 5,
  },
  inlineErrorText: {
    color: 'red',
    fontSize: 10
  },
  addButton: {
    backgroundColor: '#61dafb',
    paddingVertical: 10,
    paddingHorizontal: 20,
    borderRadius: 5,
  },
  addButtonText: {
    color: '#ffffff',
    fontSize: 16,
  }
});

export default App;
